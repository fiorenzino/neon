package ovh.flw.neon.model;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;

@NodeEntity
public class Student  extends Entity {
    String name;

    @Relationship(type = "ENROLLED")
    Set<Enrollment> enrollments;

    @Relationship(type = "BUDDY", direction = Relationship.INCOMING)
    Set<StudyBuddy> studyBuddies;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", enrollments=" + enrollments +
                ", studyBuddies=" + studyBuddies +
                '}';
    }
}