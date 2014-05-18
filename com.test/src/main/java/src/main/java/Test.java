package src.main.java;

import org.jclouds.ContextBuilder;
import org.jclouds.compute.ComputeService;
import org.jclouds.compute.ComputeServiceContext;
import org.jclouds.compute.domain.NodeMetadata;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("aa");
		ComputeServiceContext context = ContextBuilder
				.newBuilder("aws-ec2")
				.credentials("AKIAJ3STKUYPPIVNYFSA",
						"d0eC/E8G+DJkaAshxp7aodwqYA0AVC7MAYLoMT5m")
				.buildView(ComputeServiceContext.class);
		ComputeService compute = context.getComputeService();
		// Set<? extends ComputeMetadata> images = compute.listNodes();
		// Iterator<? extends ComputeMetadata> ite = images.iterator();
		// while (ite.hasNext()) {
		// ComputeMetadata image = ite.next();
		// System.out
		// .println("===================================================");
		// System.out.println("Id = "+image.getId());
		// System.out.println("Name = "+image.getName());
		NodeMetadata meta = compute.getNodeMetadata("us-west-2/i-84721c8d");
		System.out.println("Name = " + meta.getName());
		System.out.println("Name = " + meta.getOperatingSystem());
		System.out.println("Name = " + meta.getLocation());
		System.out.println("Name = " + meta.getStatus());
		System.out.println("Name = " + meta.getBackendStatus());
		compute.suspendNode("us-west-2/i-84721c8d");
		// }
		// ComputeService compute = new
		// ComputeServiceContextFactory().createContext("aws-ec2",
		// "accesskeyid", "secretkey");

	}
}
