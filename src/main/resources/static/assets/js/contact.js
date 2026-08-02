const contactForm = document.getElementById("contactForm");

contactForm.addEventListener("submit", async function (e) {

    e.preventDefault();

    const contact = {
        fullName: document.getElementById("fullName").value,
        email: document.getElementById("email").value,
        subject: document.getElementById("subject").value,
        message: document.getElementById("message").value
    };

    try {

        const response = await fetch("http://localhost:8081/api/contact", {

            method: "POST",

            headers: {
                "Content-Type": "application/json"
            },

            body: JSON.stringify(contact)

        });

        if (response.ok) {

            alert("Message Sent Successfully!");

            contactForm.reset();

        } else {

            alert("Failed to send message.");

        }

    } catch (error) {

        alert("Server Error!");

        console.log(error);

    }

});