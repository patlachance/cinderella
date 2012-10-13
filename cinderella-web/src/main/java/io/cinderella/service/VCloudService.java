package io.cinderella.service;

import io.cinderella.domain.*;
import org.jclouds.vcloud.director.v1_5.domain.VApp;
import org.jclouds.vcloud.director.v1_5.domain.Vdc;
import org.jclouds.vcloud.director.v1_5.domain.org.Org;
import org.jclouds.vcloud.director.v1_5.user.VCloudDirectorApi;

/**
 * @author shane
 * @since 9/27/12
 */
public interface VCloudService {

    DescribeImagesResponseVCloud getVmsInVAppTemplatesInOrg(DescribeImagesRequestVCloud describeImagesRequestVCloud);

    DescribeInstancesResponseVCloud getVmsInVAppsInVdc(DescribeInstancesRequestVCloud describeInstancesRequestVCloud);

    String getVdcName();

    Org getOrg(String vdcName);

    Vdc getVDC(String vdcName);

    VCloudDirectorApi getVCloudDirectorApi();

    DescribeRegionsResponseVCloud describeRegions(DescribeRegionsRequestVCloud describeRegionsRequestVCloud) throws Exception;

    DescribeAvailabilityZonesResponseVCloud describeAvailabilityZones(DescribeAvailabilityZonesRequestVCloud vCloudRequest);

    StopInstancesResponseVCloud shutdownVApp(StopInstancesRequestVCloud vCloudRequest);

    StartInstancesResponseVCloud startVApp(StartInstancesRequestVCloud vCloudRequest);

    RunInstancesResponseVCloud runInstances(RunInstancesRequestVCloud vCloudRequest);
}
