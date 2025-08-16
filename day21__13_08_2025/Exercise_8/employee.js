// List of employees
let employees = [
    { 
        name: "Sumaiya", 
        role: "Manager", 
        empId: 101,
         salary: 80000 },
    {
         name: "Riya",
          role: "Developer", 
          empId: 102, 
          salary: 60000
     },
    { name: "Karan", 
        role: "Manager", 
        empId: 103, 
        salary: 85000 
    },
    { 
        name: "Neha", 
        role: "QA", 
        empId: 104, 
        salary: 50000
     },
    { 
        name: "ISha", 
        role: "Manager", 
        empId: 105, 
        salary: 90000
     }
];
let totalManagerSalary = employees
    .filter(emp => emp.role === "Manager")
    .reduce((total, emp) => total + emp.salary, 0);

console.log("Total Salary of Managers:", totalManagerSalary);

