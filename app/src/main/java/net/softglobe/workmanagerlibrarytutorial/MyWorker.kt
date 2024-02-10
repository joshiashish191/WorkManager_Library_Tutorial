package net.softglobe.workmanagerlibrarytutorial

import android.content.Context
import android.util.Log
import androidx.work.Data
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyWorker(context: Context, params : WorkerParameters) : Worker(context, params) {
    override fun doWork(): Result {

        val inputData = inputData.getString("inputKey")
        Log.d("CheckWorkManager", "Work performed input data: $inputData")


        val data = Data.Builder().putString("ouputKey", "Output data from Worker").build()

        return Result.success(data)
    }

}