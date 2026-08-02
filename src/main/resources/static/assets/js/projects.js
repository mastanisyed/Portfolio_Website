async function loadProjects() {

    try {

        const response = await fetch("http://localhost:8081/api/projects");

        const projects = await response.json();

        console.log(projects);

    } catch (error) {

        console.log(error);

    }

}

loadProjects();