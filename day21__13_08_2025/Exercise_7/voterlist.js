let persons = [
    {
         name: "Sumaiya", 
         age: 22, city: 
         "Mumbai" 
        },

    {
         name: "Riya",
          age: 17,
           city: "Pune"
         },
    { 
        name: "Karan",
         age: 25, 
         city: "Delhi" 
        },
    {
         name: "Neha", 
         age: 16,
          city: "Bangalore" },
    {
        name: "Isha",
        age: 30,
         city: "Hyderabad" 
        }
];

let eligibleVoters = persons.filter(person => person.age >= 18);

console.log(eligibleVoters)
