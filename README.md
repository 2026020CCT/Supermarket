[README.md](https://github.com/user-attachments/files/34516705/README.md)
# Supermarket Organisation Prototype

Command-line Java (NetBeans) prototype that models a supermarket's staff and organisational structure.
Built for the CCT College Dublin H.Dip in Computing, Algorithms & Constructs CA (System Modelling & Build).

## Features

- **Read data from file**: loads employee records from a CSV text file (`SampleData.txt`).
- **Sort**: recursive quick sort of employees by name; the first 20 names are displayed.
- **Search**: recursive binary search by name on the sorted list; returns manager type (position) and department.
- **Add records**: enter a name, choose a manager type and a department; input is validated and the new record is stored and displayed.
- **Binary tree hierarchy**: builds a tree of at least 20 employees (Name, Designation, Department), then shows a level-order traversal, the tree height and the total number of nodes.
- **Enum-driven menu**: all menu options are defined with enums.

## Requirements

- Java JDK [add your version, e.g. 17+]
- Apache NetBeans (project created in NetBeans, standard Ant build)
- No external libraries or dependencies (no Maven/Gradle)

## How to run

1. Clone the repository: `git clone https://github.com/2026020CCT/Supermarket.git`
2. Open the project folder in NetBeans (File > Open Project).
3. Make sure `SampleData.txt` is in the project's root folder, or enter its full path when prompted.
4. Run the project (F6). The main class is `[add your main class name]` in package `supermarket`.

## Menu options

| Option | What it does |
|---|---|
| SORT | Sorts the employee list alphabetically and shows the first 20 names |
| SEARCH | Finds an employee by name and shows their manager type and department |
| ADD RECORDS | Adds a new employee with validated manager type and department |
| CREATE BINARY TREE | Builds the employee hierarchy and prints it level by level with height and node count |
| EXIT | Closes the program |

## Project structure

```
src/supermarket/
    [Main class]      - menu loop and program entry point
    Employee          - employee data (name, department, position, etc.)
    Sorting           - recursive quick sort
    [Searching class] - recursive binary search
    [Queue class]     - custom queue used for level-order tree operations
    [Tree classes]    - tree node and binary tree
    [Enums]           - menu options, manager types, departments
SampleData.txt        - sample employee data (CSV)
```

Update the names in square brackets to match your actual files.

## Data format

`SampleData.txt` is comma-separated with this header:

`First name,Last name,Gender,Email,Salary,Department,Position,Job title,Company`

Some rows have an empty Position field; the file reader handles this.

## Algorithm choices

The reasons for choosing the sorting and searching algorithms are explained in the accompanying report (Word document in this repository).

## Author

Eska, CCT College Dublin, H.Dip in Computing (Feb 2026 cohort)
