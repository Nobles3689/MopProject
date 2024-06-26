package com.example.cofinder.Data


data class UserData(
    var studentID: String = "default",
    var password: String = "1234",
    var projects: MutableList<TeamData> = mutableListOf(),
    var schedules: MutableList<ScheduleData>? = mutableListOf()
) {
    constructor() : this("default", "1234", projects = mutableListOf())
}