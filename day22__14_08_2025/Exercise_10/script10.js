
function sumNumbers(...nums) {
    return nums.reduce((total, num) => total + num, 0);
}

let total = sumNumbers(5, 10, 15, 20);

console.log("Sum of numbers:", total);

