let mathsScore = prompt("Please enter the student's Maths score:");

mathsScore = parseInt(mathsScore); 

if (mathsScore === 100) {
  alert("Phenomenal!");
} else if (mathsScore > 85) {
  alert("Excellent!");
} else if (mathsScore >= 71 && mathsScore <= 85) {
  alert("Good work!");
} else if (mathsScore >= 51 && mathsScore <= 70) {
  alert("Practice well!");
} else {
  alert("Hard work is needed");
}
