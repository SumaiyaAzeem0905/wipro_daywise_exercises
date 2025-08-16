
let persons = [
    { name: "Sumaiya", age: 25, city: "Delhi" },
    { name: "Riya", age: 17, city: "Mumbai" },
    { name: "Isha", age: 30, city: "Pune" },
    { name: "Neha", age: 15, city: "Kolkata" }
];

for (let i = 0; i < persons.length; i++) {
    if (persons[i].age >= 18) {
        persons[i].status = "Adult";
    } else {
        persons[i].status = "Minor";
    }
}

console.log("Updated Persons List:", persons);


