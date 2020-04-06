package ovh.flw.neon;

import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import ovh.flw.neon.model.Department;

public class Starter {

    private static final int DEPTH_LIST = 0;
    private static final int DEPTH_ENTITY = 1;

    public static void main(String[] args) {
        Configuration configuration = new Configuration.Builder()
                .uri("bolt://localhost:7687")
                .credentials("neo4j", "secret")
                .build();

        SessionFactory sessionFactory = new SessionFactory(configuration, "ovh.flw.neon.model");
        Session session = sessionFactory.openSession();
        Department department = new Department();
        department.name = "prova";
        session.save(department, DEPTH_ENTITY);
        Department dep = session.load(Department.class, department.id, DEPTH_ENTITY);
        System.out.println(dep);
        sessionFactory.close();
    }
}
