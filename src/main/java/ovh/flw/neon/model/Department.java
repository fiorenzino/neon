package ovh.flw.neon.model;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;

@NodeEntity
public class Department extends Entity {
    public String name;

    @Relationship(type = "CURRICULUM")
    public Set<Subject> subjects;

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
