/*
 * Binance Spot REST API
 * OpenAPI Specifications for the Binance Spot REST API  API documents:   - [Github rest-api documentation file](https://github.com/binance/binance-spot-api-docs/blob/master/rest-api.md)   - [General API information for rest-api on website](https://developers.binance.com/docs/binance-spot-api-docs/rest-api/general-api-information)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.spot.rest.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.Symbols;
import com.binance.connector.client.spot.rest.model.TickerPriceResponse;

/** API examples for MarketApi */
public class TickerPriceExample {
    private SpotRestApi api;

    public SpotRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = SpotRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("96to4bXTnI4mZxMrs00gSePAXOp5I4flwHtsCnOyd11FjzQKocHiuN8clBF0i7s4");
            //signatureConfiguration.setPrivateKey("path/to/private.key");
            signatureConfiguration.setSecretKey("MaZljMzJ6pAUiZvGcsjcDHHSkD2naqb6XiI6Y0fv6bBWt5RHC30wuvJIKyPCHVCZ");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SpotRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Symbol price ticker
     *
     * <p>Latest price for a symbol or symbols. Weight: &lt;table&gt; &lt;thead&gt; &lt;tr&gt;
     * &lt;th&gt;Parameter&lt;/th&gt; &lt;th&gt;Symbols Provided&lt;/th&gt;
     * &lt;th&gt;Weight&lt;/th&gt; &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;2\&quot;&gt;symbol&lt;/td&gt; &lt;td&gt;1&lt;/td&gt;
     * &lt;td&gt;2&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;symbol parameter is
     * omitted&lt;/td&gt; &lt;td&gt;4&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;symbols&lt;/td&gt;
     * &lt;td&gt;Any&lt;/td&gt; &lt;td&gt;4&lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt; &lt;/table&gt;
     *
     * @throws ApiException if the Api call fails
     */
    public void tickerPriceExample() throws ApiException {
        String symbol = "BNBUSDT";
        Symbols symbols = new Symbols();
        symbols.add("BNBUSDT");
        ApiResponse<TickerPriceResponse> response = getApi().tickerPrice(symbol, null);
        System.out.println(response.getData().getTickerPriceResponse1());
        //System.out.println(response.getData().getTickerPriceResponse2());
        System.out.println(response.getData().toJson());
    }
    public static void main(String[] args) throws ApiException {
        TickerPriceExample example = new TickerPriceExample();
        example.tickerPriceExample();
    }
}
