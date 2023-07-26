def get_grade(marks):
    if marks >= 90:
        return "A+"
    elif marks >= 80:
        return "A"
    elif marks >= 70:
        return "B"
    elif marks >= 60:
        return "C"
    elif marks >= 50:
        return "D"
    elif marks<50:
        return "Fail"
    else:
        return "invalid"

def main():
    students = int(input("Enter the number of students: "))
    names = []
    marks = []

    for i in range(students):
        name = input(f"Enter name of student {i + 1}: ")
        marks.append(int(input(f"Enter marks of student {i + 1}: ")))
        grade = get_grade(marks[i])
        print(f"Student {name} has been graded {grade}")

if __name__ == "__main__":
    main()
