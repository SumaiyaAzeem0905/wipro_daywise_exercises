let images = [
    "https://via.placeholder.com/300x200?text=Image+1",
    "https://via.placeholder.com/300x200?text=Image+2",
    "https://via.placeholder.com/300x200?text=Image+3",
    "https://via.placeholder.com/300x200?text=Image+4"
];

let currentIndex = 0;

function showImage(index) {
    document.getElementById("galleryImage").src = images[index];
}

// Show first image initially
showImage(currentIndex);

function nextImage() {
    currentIndex++;
    if (currentIndex >= images.length) {
        currentIndex = 0; // loop back to first
    }
    showImage(currentIndex);
}

function prevImage() {
    currentIndex--;
    if (currentIndex < 0) {
        currentIndex = images.length - 1; // loop to last
    }
    showImage(currentIndex);
}
