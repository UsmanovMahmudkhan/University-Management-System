# University Management System

This repository contains a basic Java-based skeleton for a University Management System. The project is organized as a multi-module Maven build with the following modules:

- **core** – defines the core domain classes such as `Student`.
- **auth** – contains simple authentication services.
- **csv** – provides a basic text import utility and a console application demonstrating how to read student data from a text file and authenticate a user.

## Project Structure

The project uses Maven's multi-module structure. The root `pom.xml` lists the modules:

- `core`
- `auth`
- `csv`

Each submodule has its own `pom.xml` inheriting from the parent. Dependencies are declared as needed (e.g., `auth` depends on `core`, and `csv` depends on both `core` and `auth`).

### core Module

Contains domain classes:

- `Student` – simple data class with id, name and major.

### auth Module

Contains authentication service:

- `AuthService` – placeholder service that always returns `true` for any credentials (to be replaced by a real implementation).

### csv Module

Contains utilities and the example console application:

- `TextImporter` – reads a text file where each line represents a student record (fields separated by commas) and returns a list of `Student` objects.
- `Main` – demonstrates a simple workflow: authenticate a hard‑coded user, import students from a file named `students.txt`, and print them to the console.

## Building the Project

Ensure you have Java and Maven installed. To build the entire project, run:

```
mvn clean install
```

This will compile all modules and install them in your local Maven repository.

## Running the Example Console Application

After building, you can run the example console application from the `csv` module. Use the following Maven command from the project root:

```
mvn -pl csv exec:java -Dexec.mainClass=com.university.csv.Main
```

Place a `students.txt` file in the working directory containing lines like:

```
1,John Doe,Computer Science
2,Jane Smith,Mathematics
```

The application will authenticate using dummy credentials and display the imported student records.

## Next Steps

This skeleton is meant to serve as a starting point. Possible next steps include:

- Implement a real authentication mechanism in the `auth` module.
- Expand the `core` module to include additional entities such as courses, instructors, and enrollments.
- Enhance the import functionality to support CSV or JSON formats.
- Develop a proper command-line or web interface for user interaction.
