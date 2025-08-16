function validateEmail() {
    let email = document.getElementById("email").value.trim();
    let emailError = document.getElementById("emailError");

    // Email regex pattern
    let emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (email === "") {
        emailError.textContent = "Email cannot be empty";
        return false;
    } else if (!emailPattern.test(email)) {
        emailError.textContent = "Please enter a valid email";
        return false;
    } else {
        emailError.textContent = "";
        return true;
    }
}

function validatePassword() {
    let password = document.getElementById("password").value.trim();
    let passwordError = document.getElementById("passwordError");

    if (password === "") {
        passwordError.textContent = "Password cannot be empty";
        return false;
    } else {
        passwordError.textContent = "";
        return true;
    }
}

function validateForm() {
    let isEmailValid = validateEmail();
    let isPasswordValid = validatePassword();

    if (isEmailValid && isPasswordValid) {
        alert("Login successful!");
    }
}
