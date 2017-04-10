package com.howtodoinjava.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import java.time.LocalDate;

//@Path("/message")
public class JerseyService
{
    @GET
    public String getMsg()
    {
         return "Hello World !! - Jersey 2";
    }


    @GET
    @Path("/priceList")
    @Produces(MediaType.APPLICATION_JSON)
    public String getM(){
//        List<ProductPrice>getPrices(@QueryParam("productName") String productName){
//            List<ProductPrice> productPrices = new ArrayList<>();

//        LocalDate today = LocalDate.now();
//        productPrices.add(0,new ProductPrice("wer",new BigDecimal(10),today,today));
//        ProductPrice prod = null; //productPrices.get(0); //r = null;
//        for (ProductPrice p : productPrices) {
//            if (p.getProductName() == "2cxv")
//                prod = p;
//        }
//        return productPrices.get(0);

        return "wdc"; //productPrices;
    };
}
