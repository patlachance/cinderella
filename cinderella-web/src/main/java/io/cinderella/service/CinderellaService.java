package io.cinderella.service;

import com.amazon.ec2.*;

/**
 * @author shane
 * @since 9/28/12
 */
public interface CinderellaService {

    /**
     * ec2-describe-availability-zones -U http://localhost:8080/api/ -O AKIAJLRNZIQQ37IVPP3Q -W 5YVvxvaPCcJ2vr5/ZyRsKKuvo6WJvV1KMnUYm+7J -v --debug --request-timeout 120
     * @param describeAvailabilityZones
     * @return
     */
    DescribeAvailabilityZonesResponse describeAvailabilityZones(DescribeAvailabilityZones describeAvailabilityZones);

    /**
     * ec2-describe-regions -U http://localhost:8080/api/ -O AKIAJLRNZIQQ37IVPP3Q -W 5YVvxvaPCcJ2vr5/ZyRsKKuvo6WJvV1KMnUYm+7J -v --debug --request-timeout 120
     * @param describeRegions
     * @return
     */
    DescribeRegionsResponse describeRegions(DescribeRegions describeRegions);

    /**
     * ec2-describe-images -U http://localhost:8080/api/ -O AKIAJLRNZIQQ37IVPP3Q -W 5YVvxvaPCcJ2vr5/ZyRsKKuvo6WJvV1KMnUYm+7J -v --debug --request-timeout 120
     * @param describeImages
     * @return
     */
    DescribeImagesResponse describeImages(DescribeImages describeImages);

    /**
     * euca-describe-instances -U http://localhost:8080/api/ -a AKIAJLRNZIQQ37IVPP3Q -s 5YVvxvaPCcJ2vr5/ZyRsKKuvo6WJvV1KMnUYm+7J --debug
     * ec2-describe-instances -U http://localhost:8080/api/ -O AKIAJLRNZIQQ37IVPP3Q -W 5YVvxvaPCcJ2vr5/ZyRsKKuvo6WJvV1KMnUYm+7J -v --debug --request-timeout 120
     * @param describeInstances
     * @return
     */
    DescribeInstancesResponse describeInstances(DescribeInstances describeInstances);


    /**
     * ec2-describe-group -U http://localhost:8080/api/ -O AKIAJLRNZIQQ37IVPP3Q -W 5YVvxvaPCcJ2vr5/ZyRsKKuvo6WJvV1KMnUYm+7J -v --debug --request-timeout 120
     * @param describeSecurityGroups
     * @return
     */
    DescribeSecurityGroupsResponse describeSecurityGroups(DescribeSecurityGroups describeSecurityGroups);

}
