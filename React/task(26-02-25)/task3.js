import React from "react";

function StudentList() {
    const students = [
        { name: "Sachin Tendulkar", department: "Computer Science" },
        { name: "Michael Jordan", department: "Mechanical Engineering" },
        { name: "Serena Williams", department: "Electrical Engineering" },
        { name: "Cristiano Ronaldo", department: "Civil Engineering" },
        { name: "Usain Bolt", department: "Sports Science" },
        { name: "Lionel Messi", department: "Information Technology" }
    ];

    return (
        <div style={{ textAlign: "center", marginTop: "20px" }}>
            <h1>Student List</h1>
            <ul style={{ listStyle: "none", padding: 0 }}>
                {students.map((student, index) => (
                    <li key={index} style={{ fontSize: "20px", margin: "10px 0" }}>
                        {student.name} - {student.department}
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default StudentList;
