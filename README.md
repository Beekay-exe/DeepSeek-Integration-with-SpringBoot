# DeepSeek-Integration-with-SpringBoot
Made using Ollama, Deepseek build, Springboot and Thymeleaf

This repository contains a simple Spring Boot application that integrates with DeepSeek using the `ChatClient` for AI-powered chat functionality.

## Features
- A web interface to send prompts and receive AI-generated responses.
- Integration with DeepSeek using `ChatClient`.
- Error handling for failed responses.

## Prerequisites
Ensure you have the following installed:
- Java 17 or later
- Maven or Gradle
- Spring Boot

## Setup

1. Clone the repository:
   ```sh
   git clone https://github.com/Beekay-exe/DeepSeek-Integration-with-SpringBoot.git
   cd DeepSeek-Integration-with-SpringBoot
   ```

2. Build the project:
   ```sh
   mvn clean install
   ```

3. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## API Endpoints
- `GET /` - Displays the chat form.
- `POST /sendPrompt` - Sends a prompt to DeepSeek and returns a response.

## Code Structure
- `DeepSeekChatController.java`: Handles HTTP requests and integrates with DeepSeek.
- `templates/chat-form.html`: Frontend form for user interaction.

## Usage
1. Open `http://localhost:8080/` in a web browser.
2. Enter a prompt and submit the form.
3. View the AI-generated response.

## License
This project is open-source and available under the MIT License.


