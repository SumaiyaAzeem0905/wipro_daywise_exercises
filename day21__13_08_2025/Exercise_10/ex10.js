let persons = [
    { name: "Amit", age: 25, city: "Delhi" },
    { name: "Riya", age: 17, city: "Mumbai" },
    { name: "Karan", age: 30, city: "Pune" },
    { name: "Neha", age: 15, city: "Kolkata" }
];

let updatedPersons = persons.map(person => {
    person.status = person.age >= 18 ? "Adult" : "Minor";
    return person;
});
console.log("Updated Persons List:", updatedPersons);