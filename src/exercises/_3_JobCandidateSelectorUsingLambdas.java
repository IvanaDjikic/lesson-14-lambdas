package exercises;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _3_JobCandidateSelectorUsingLambdas {
	public static void main(String[] args) {

		// 1. Sort the candidates by salary requirements, low to high.
		Collections.sort(JobCandidate.jobCandidates, (jc1, jc2) -> jc1.getSalaryRequired() - jc2.getSalaryRequired());
		System.out.println(JobCandidate.jobCandidates);
		// 2. Filter out any candidates that have not been taught by me (June)
		Stream<JobCandidate> streamOfCandidates = JobCandidate.jobCandidates.stream();

		Predicate<JobCandidate> predicate1 = jc -> jc.getTeacherName().contains("June")
				|| jc.getTeacherName().contains("Joon");
		List<JobCandidate> candidatesTaughtByJune = streamOfCandidates.filter(predicate1).collect(Collectors.toList());
		System.out.println(candidatesTaughtByJune);

		// Hint: see the removeIf() method in the Collections class

	}
}
