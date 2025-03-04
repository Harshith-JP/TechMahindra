document.addEventListener("DOMContentLoaded", function() {
    console.log("Website loaded successfully!");

    const navLinks = document.querySelectorAll("nav ul li a");
    
    navLinks.forEach(link => {
        link.addEventListener("click", function(event) {
            event.preventDefault();
            console.log(`Navigating to: ${link.textContent}`);
        });
    });
});
