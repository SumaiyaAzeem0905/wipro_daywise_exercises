function checkPalindrome() {
    let str = document.getElementById("textInput").value;
   
    let cleaned = str.replace(/\s+/g, '').toLowerCase();

    let reversed = cleaned.split('').reverse().join('');

    if (cleaned === reversed) {
        document.getElementById("result").textContent = `"${str}" is a palindrome ✅`;
    } else {
        document.getElementById("result").textContent = `"${str}" is not a palindrome ❌`;
    }
}
