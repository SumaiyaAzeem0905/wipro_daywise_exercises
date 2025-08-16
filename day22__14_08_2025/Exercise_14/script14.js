const userIdInput = document.getElementById("userId");
const passwordInput = document.getElementById("password");
const statusPara = document.getElementById("status");

if (localStorage.getItem("userId")) {
    statusPara.textContent = `Welcome back, ${localStorage.getItem("userId")}`;
}

document.getElementById("loginBtn").addEventListener("click", function() {
    const userId = userIdInput.value.trim();
    const password = passwordInput.value.trim();

    if (userId && password) {
        localStorage.setItem("userId", userId);
        statusPara.textContent = `Logged in as ${userId}`;
        alert("Login successful!");
    } else {
        alert("Please enter both User ID and Password");
    }
});

document.getElementById("logoutBtn").addEventListener("click", function() {
    if (localStorage.getItem("userId")) {
        localStorage.removeItem("userId");
        statusPara.textContent = "You have logged out.";
        alert("Logout successful!");
    } else {
        alert("You are not logged in.");
    }
});
