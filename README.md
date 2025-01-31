## **Description of project**
### The main aim of this project is to output my email, current date in ISO 8601 format(UTC) and the github url where this project is hosted.

## **Setup Instructions**


### **Local Machine(Laptop)**
- **Ensure the latest version of maven and java 23 is installed on your device. Ensure you set the paths too.**


- **Clone this repository to your local machine to any directory of your choice.**


- **Run "mvn clean install" on your terminal in the directory  where the "pom.xml" file is("hngStage0" directory) in order to download all the project's dependencies.**


- **Make sure you are in the directory where the "pom.xml" file is("hngStage0" directory). Run "mvn compile" to compile the codes. After compilation run "mvn spring-boot:run". This should start the application and you can proceed to test endpoint on postman**


### **Docker**
- **Clone this repository to your local machine to any directory of your choice.**


- **Make sure docker is started on your system. Create a docker image by running this command - "docker build -t your-image-name ." in your project's directory(hngStage0). Please include the full stop(.) at the end.**


- **Run the container by running this command - "docker run -d -p 8080:8080 your-image-name".**


- **After this you can test on postman or a web browser. After testing stop container(docker stop containerId). Run docker ps to check the id of your container.**


### **Endpoint**

- **URL**: `/api/v1/getInfo`
- **Method**: `GET`
- **Content-Type/Request/Response format**: `application/json`
- **Chosen Programming language**: `https://hng.tech/hire/java-developers`


