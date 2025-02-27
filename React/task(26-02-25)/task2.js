function CheckCards() {
    let hasAadhar = prompt("Do you have an Aadhar Card? (yes/no)") === "yes";
    let hasPAN = prompt("Do you have a PAN Card? (yes/no)") === "yes";

    return (
        <>
            {hasAadhar || hasPAN ? (
                <h1>You are eligible for the government offer.</h1>
            ) : (
                <h1>You are not eligible for the government offer.</h1>
            )}
        </>
    );
}

export default CheckCards;
