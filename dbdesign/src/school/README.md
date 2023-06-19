# School
- Problem Statement: Given a scenario of school. design a schema for the same.

### Requirements
1. A college has many departments
2. A department has many students
3. A department also have many professors
4. A professor can teach many students.
5. A single course can be taught by many professors to many students.

### Which database to pick?
1. Do we have relational data? Yes
2. Do we need to perform complex joins? Maybe
3. Do we need horizontal scalability? Maybe
4. Do we need strictly ACID (Atomicity, Consistency, Isolation, Durability) compliant database. Yes, it has to be
5. Do we need flexibility of schema? Not required for know
6. How good performance we need? It should handle complex queries more

### So we are picking RDBMS.
1. MySQL?
   1. Simplicity
   2. Read-heavy workload
   3. Strong integration with web technologies
   4. Excellent support for indexing, caching and query optimisation.
   5. Purely relational database
   6. Better for website and online transactions
2. Postgres?
   1. Advanced features, extensibility.
   2. Rich data types
   3. Table inheritance & JSONB data types
   4. Geospatial data
   5. Object Relation Database
   6. Better for large and complicated analytical process.

### We will use MySQL

### Tables
1. college: id, name, location, start_date
2. department: id, name, location
3. student: id, name, address, department_id [1:M]
4. professor: id, name, address, department_id [1:M]
5. course: id, name
6. student_course: id, course_id, student_id
7. professor_course: id, professor_id, course_id

Sample Entity (Hibernate):
````
@Entity
public class Course {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
   private String name;
   @OneToMany(mappedBy ="courses")
   @JoinColumn(name="professor_id")
   private Set<Professor> professors = new HashSet<>();
   @ManyToMany(mappedBy = "students")
   private Set<Student> students = new HashSet<>();
}
````



