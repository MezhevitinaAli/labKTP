groupmates = [
    {
        "name": "Александр",

        "surname": "Петров",

        "exams": ["ТПР", "MATlAB", "ВМ"],

        "marks": [4, 3, 5]
    },
    {
        "name": "Николай",

        "surname": "Морозов",

        "exams": ["ТПР", "MATlAB", "ВМ"],

        "marks": [4, 4, 5]
    },
    {
        "name": "Кирилл",

        "surname": "Иванов",

        "exams": ["ТПР", "MATlAB", "ВМ"],

        "marks": [5, 5, 5]
    },
     {
        "name": "Александр",

        "surname": "Смирнов",

        "exams": ["ТПР", "MATlAB", "ВМ"],

        "marks": [3, 3, 3]
    },
     {
        "name": "Мария",

        "surname": "Попова",

        "exams": ["ТПР", "MATlAB", "ВМ"],

        "marks": [4, 3, 3]
    },
        
]
    
def count_mark(students,mark):
    print ("name".ljust(15), "surname".ljust(8), "exams".ljust(8), "marks".ljust(20))
    for student in students:
        marks_list = student['marks']
        result =  (sum(marks_list)/len(marks_list))
        if result >= need:
            print(student["name"].ljust(15), student["surname"].ljust(8), str(student["exams"]).ljust(8), str(student["marks"]).ljust(20))

need = int(input('Input :'))

count_mark(groupmates,need)
