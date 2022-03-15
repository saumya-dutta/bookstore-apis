// GENERATED BY S3LM4
package org.demo.controller.mapper;


public final class CountryMapperSelmaGeneratedClass
    implements CountryMapper {

  @Override
  public final org.demo.controller.resource.CountryResource map(org.demo.entity.Country inCountry) {
    org.demo.controller.resource.CountryResource out = null;
    if (inCountry != null) {
      out = new org.demo.controller.resource.CountryResource();
      out.setCode(inCountry.getCode());
      out.setName(inCountry.getName());
    }
    return out;
  }


  @Override
  public final org.demo.entity.Country map(org.demo.controller.resource.CountryResource inCountryResource) {
    org.demo.entity.Country out = null;
    if (inCountryResource != null) {
      out = new org.demo.entity.Country();
      out.setCode(inCountryResource.getCode());
      out.setName(inCountryResource.getName());
    }
    return out;
  }


  @Override
  public final org.demo.entity.Country map(org.demo.controller.resource.CountryResource inCountryResource, org.demo.entity.Country out) {
    if (inCountryResource != null) {
      if (out == null) {
        out = new org.demo.entity.Country();
      }
      out.setCode(inCountryResource.getCode());
      out.setName(inCountryResource.getName());
    }
    if (fr.xebia.extras.selma.SelmaUtils.areNull(inCountryResource)) {
      out = null;
    }
    return out;
  }


  @Override
  public final java.util.List<org.demo.controller.resource.CountryResource> map(java.util.List<org.demo.entity.Country> inCountry) {
    java.util.List<org.demo.controller.resource.CountryResource> out = null;
    if (inCountry != null) {
      java.util.ArrayList<org.demo.controller.resource.CountryResource> aoutTmpCollection = new java.util.ArrayList<org.demo.controller.resource.CountryResource>(inCountry.size());
      for (org.demo.entity.Country aoutItem : inCountry) {
        aoutTmpCollection.add(map(aoutItem));
      }
      out = aoutTmpCollection;
    }
    return out;
  }



  /**
   * Single constructor
   */
  public CountryMapperSelmaGeneratedClass() {
  }

}