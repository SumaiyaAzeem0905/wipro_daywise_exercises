let textBox = document.getElementById("myText");
let charLabel = document.getElementById("charCount");
let maxLength = 50;

textBox.addEventListener("input", function () {
    let remaining = maxLength - textBox.value.length;
    charLabel.textContent = remaining + " characters remaining";
});
