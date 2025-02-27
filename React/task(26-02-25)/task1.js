import React from "react";

function Divisible() {
    const checkDivisibility = () => {
        let num = prompt("Enter a number");

        if (num !== null) {
            alert(num % 16 == 0 ? "Divisible by 16" : "Not Divisible by 16");
        }
    };

    return (
        <div>
            <button onClick={checkDivisibility}>Check Divisibility</button>
        </div>
    );
}

export default Divisible;
