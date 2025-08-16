
let date = new Date(2030, 7, 13); 

let days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];

let dayName = days[date.getDay()];

document.getElementById("result").textContent = `13th August 2030 will be a ${dayName}.`;

console.log(`13th August 2030 will be a ${dayName}.`);
