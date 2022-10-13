package com.mostafadev.quiz_app

data class Question(
    val id: Int,
    val question: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
)

fun getQuestions(): ArrayList<Question> {
    val questionList = ArrayList<Question>()
    val q1 = Question(
        1,
        "كم كان عمر النبي محمد صلى الله عليه وسلم عندما توفيت أمه؟",
        "3 سنوات",
        " 4 سنوات ",
        "5 سنوات",
        "6 سنوات",
        4
    )

    val q2 = Question(
        2,
        "ما هي أطول سورة في القرآن الكريم؟",
        "سورة البقرة",
        "سورة آل عمران",
        "سورة النساء",
        "سورة المائدة",
        1
    )

    val q3 = Question(
        3,
        "الشهر الثالث في التقويم الهجري؟",
        "شعبان",
        "ربيع الأول",
        "جمادى الآخرة",
        "ذو القعدة",
        2

    )
    val q4 = Question(
        4,
        "ما السورة التي ختمت باسم وقت من أوقات الصلاة؟",
        "سورة القدر",
        "سورة البلد",
        "سورة الأعلى",
        "سورة الفجر",
        1
    )
    val q5 = Question(
        5,
        "كم عدد التكبيرات في الركعة الأولى في صلاة العيد؟",
        "ستة",
        "سبعة",
        "تسعة",
        "خمسة",
        2
    )
    val q6 = Question(
        6,
        "في أي جهة يقع باب الكعبة المشرفة؟",
        "في الجهة الغربية من الكعبة",
        "في الجهة الجنوبية من الكعبة",
        "في الجهة الشمالية من الكعبة",
        "في الجهة الشرقية من الكعبة",
        4
    )
    val q7 = Question(
        7,
        "كم عدد مصارف الزكاة؟",
        "ثمانية",
        "خمسة",
        "سبعة",
        "تسعة",
        1
    )
    val q8 = Question(
        8,
        "كم مرة ذكرت السيدة مريم في القرآن الكريم؟",
        "43 مرة",
        "55 مرة",
        "42 مرة",
        "34 مرة",
        4
    )

    val q9 = Question(
        9,
        "قال تعالى في سورة العاديات: ( فالمغيرات صبحا (3)) ماالمقصود بالمغيرات؟",
        "الرياح الشديدة",
        "الابل",
        "الملائكة السابحين",
        "الخيل",
        4
    )
    val q10 = Question(
        10,
        "ما هي أعظم آية في القرآن الكريم؟",
        "آية الكرسي",
        "آخر آية من سورة الكهف",
        "آخر آية من سورة البقرة",
        "أول آية من سورة البقرة",
        1
    )
    questionList.add(q1)
    questionList.add(q2)
    questionList.add(q3)
    questionList.add(q4)
    questionList.add(q5)
    questionList.add(q6)
    questionList.add(q7)
    questionList.add(q8)
    questionList.add(q9)
    questionList.add(q10)



    return questionList
}
