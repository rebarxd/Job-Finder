package com.example.jobfinder.Repository

import com.example.jobfinder.Model.JobModel

class MainRepository {

    val location = listOf("Bandung, Indonesia")
    val category = listOf("all","Accountant","Programmer","Writer")

    val exampleText:String= "Kita membutuhkan orang bertalenta dan bermotivasi untuk mengembangkan tim ini, "+
            "Kandidat harus siap dan bertanggung jawab untuk pekerjaannya"
    val items = listOf(
        JobModel(
            title = "UI Designer",
            company = "Telkom",
            picUrl = "logo1",
            time = "Full-Time",
            model = "Remote",
            level = "Internship",
            location = "Bandung, Indonesia",
            salary = "Rp 1.5jt - 2jt",
            category = "2",
            exampleText,
            exampleText
        ),
        JobModel(
            title = "Accountant",
            company = "Pos Indonesia",
            picUrl = "logo2",
            time = "Full-Time",
            model = "WFO",
            level = "in person",
            location = "Bandung, Indonesia",
            salary = "Rp 4jt - 5jt",
            category = "1",
            exampleText,
            exampleText
        ),
        JobModel(
            title = "Author",
            company = "Kompas",
            picUrl = "logo3",
            time = "Full-Time",
            model = "Remote",
            level = "Internship",
            location = "Bandung, Indonesia",
            salary = "Rp 1.5jt - 2jt",
            category = "3",
            exampleText,
            exampleText
        ),
        JobModel(
            title = "FullStack Developer",
            company = "tempo.co",
            picUrl = "logo4",
            time = "Full-Time",
            model = "WFO",
            level = "Senior",
            location = "Bandung, Indonesia",
            salary = "Rp 6jt - 9jt",
            category = "2",
            exampleText,
            exampleText
        )


    )
}