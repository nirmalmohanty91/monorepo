package MyPreparation.Others;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Building {

  private String decodeVin;
  private String queryVehicleMakes;
  private String queryVehicleModels;
  private String queryVehicleSpecId;
  private String queryVehicleVariants;
  private String queryVehicleYears;
  private String queryDealershipCarlines;
  private String queryDealershipCarlinesId;
  private String createDealershipCarlines;
  private String updateDealershipCarlines;
  private String deleteDealershipCarlines;
  private String queryDealershipSettings;
  private String queryDealershipSettingsId;
  private String createDealershipSettings;
  private String updateDealershipSettings;
  private String deleteDealershipSettings;
  private String queryLaborOperation;
  private String queryLaborOperations;
  private String queryServicePackageId;
  private String queryServicePackages;
  private String querySpecificationId;
  private String querySpecificationsVin;

  public static void main(String[] args) {
    Building b = new Building();
    String s = b.toString();
    String s1 = s.substring(s.indexOf("[") + 1, s.indexOf("]"));
    List<String> s2 = Arrays.asList(s1.split(","));
    System.out.println(s2);
    String finalOP = "";
    for (String s3 : s2) {
      String[] s4 = s3.split("=");
      finalOP += s4[0] + "(" + s4[0] + ")" + ".";
    }
    System.out.println(finalOP);
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}
