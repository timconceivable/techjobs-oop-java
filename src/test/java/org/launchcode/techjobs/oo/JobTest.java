package org.launchcode.techjobs.oo;
import org.junit.Test;
import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId () {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job aJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(aJob.getName(), "Product tester");
        assertEquals(aJob.getEmployer().toString(), "ACME");
        assertEquals(aJob.getLocation().toString(), "Desert");
        assertEquals(aJob.getPositionType().toString(), "Quality control");
        assertEquals(aJob.getCoreCompetency().toString(), "Persistence");

        assertTrue(aJob.getName() instanceof String);
        assertTrue(aJob.getEmployer() instanceof Employer);
        assertTrue(aJob.getLocation() instanceof Location);
        assertTrue(aJob.getPositionType() instanceof PositionType);
        assertTrue(aJob.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(jobOne.equals(jobTwo));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job theJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String strJob = theJob.toString();
//        String[] jobArray = strJob.toString().split(lineSeparator());
//        assertEquals(jobArray[0], " ");
//        assertEquals(jobArray[jobArray.length-1], " ");
//        assertTrue(strJob.toString().startsWith("\n"));
//        assertTrue(strJob.toString().endsWith("\n"));
        assertEquals( String.valueOf(strJob.charAt(0)), "\n" );
        assertEquals( String.valueOf(strJob.charAt(strJob.length()-1)), "\n" );
    }

    //TODO: more tests
//    @Test
//    public void testToStringContainsCorrectLabelsAndData() {
//
//    }
//
//    @Test
//    public void testToStringHandlesEmptyField() {
//
//    }
}
