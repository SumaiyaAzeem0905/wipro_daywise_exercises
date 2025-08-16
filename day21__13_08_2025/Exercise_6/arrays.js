let names = ["Sumaiya", "Azeem","Lalkot", "Isha", "Sara"]
let filteredNames = names
    .filter(name => name.length > 5)
    .map(name => name.toUpperCase());

console.log("Original names:", names);
console.log("Filtered & Uppercase:", result);
