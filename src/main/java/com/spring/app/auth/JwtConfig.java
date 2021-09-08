package com.spring.app.auth;

public class JwtConfig {
    public static final String KEY = "p4ssw0rD/*}ñ";
    
    public static final String RSA_PRIVATE = "-----BEGIN RSA PRIVATE KEY-----\r\n"
            + "MIIEpQIBAAKCAQEAyY2KRnTj0KR+y/N3KmQ2msmr8OY/O0v+LINflM/JBQRsqa0J\r\n"
            + "o5RWWcL3epTx7Xf+yNA50l8Gxh3MtAMbylYLnK4RA3MAzBehWfhdJLUiQo5hPwp+\r\n"
            + "meV3km42poqVbxGfucNGXKWaOrdF+yJZCpSHn4AZKVK+nFOa1cYJMvDKh2lohBab\r\n"
            + "FlwO/Fi5jo8M4XiABZk5IIkQX/KC/rZbagHc3/qMdr7ulohJ2jxmj3w3+sxttDV5\r\n"
            + "GAb/vya/XIVaXCqpzSFKkmBV3qqlj/z8AIcIMXTZXjBLqTd+x0LvNcE9aAcA6is+\r\n"
            + "I1W2mNHhYqip142NGVPsEdNaFr1kN4GSSzPZbQIDAQABAoIBAB8z/G4/9mz8qmyk\r\n"
            + "upQjg5ifFDFtU+i4MRdvF0MQkAxozPHPyig69MtctbeSi4m6BAXOxsTc1U2im2ha\r\n"
            + "+thuTcnp4NRp33u5RM+K9dCTAkTPihqaY1MsBUD0Mx3BYrUZQ2Mc6i25rZDdgsYI\r\n"
            + "YUSUDhMRX9PX7Y6CGvxxdkcepBwmXSR4+/W7aW27122iZp7cycgdjQlB3cUgw3XL\r\n"
            + "RWYeE35XNckLeXzAi6DO+LMIavOlf3pJECfSMUVKYF1yveaMwuCU6SzrtC+6uGzy\r\n"
            + "hJvp7mbNVRRTh7p5CeGqNbdV1utLZSFdCbK0WYEBS9z0x3foi2ajkiMfgKr7iVkZ\r\n"
            + "s7C9jnkCgYEA5CC9MnUt6gLChdMS6cE+JSPMlgEzU5HKHLItcTgPKQ4PEnCtgY12\r\n"
            + "7psQEPXwrThHui3+16yfce74Bg5E7GN+epgvjSC2SQhW1UDN54AmK2Kf2+kqgmIh\r\n"
            + "jPPycgp1oicn3DkyFjlcvCUj0pPtXnIFMGfWLJ8CrxGKFd75YwJLwUcCgYEA4i2a\r\n"
            + "SyQZBYHoBi1iftYP2UUG5KdcbFeBWfjMQM4yCylN7WBQpJb4N1VPuLWf+uM1Crrv\r\n"
            + "EAM9VtJCql97cAH92S7+txcClc8JrebaQzgzynilwmx6m3T85+q6H8XtCCzHhAw0\r\n"
            + "4KqW7Em5iqNRKNzG50k1qrDLBX0YjVu8MT3fyasCgYEAyx03NyjL85H3fk2bhlMP\r\n"
            + "MOQ58Mkq2NpyeLBP84F1RhmFY+a9JR8+aF3ZpTBE1QXKH0N6pq7E3B1n6YRk64/+\r\n"
            + "ecrsc5xPkKEDJyZm7hrUYUaTjKqCtcoHk0dUcyNK71ArllG6fb0fC0mKJqCc9L1S\r\n"
            + "T3H0aJA/RH66UpTPuM6/glsCgYEAtk6dtH13MapBNGF2p9exVKa/5KRF6goqeDQD\r\n"
            + "pyTMz5ROfMyKk/AgSLGaHb9AIUDsaya8NUL3OTknhR6LZ4AjdeDcbQW+DrSgD60p\r\n"
            + "Ns9hZ40RxwIbXZzRkbnwplWqNlGpy/Tu1jyKhBD03hu/+ljidmDbQidYrabkmGRd\r\n"
            + "76746BsCgYEAzoejD9/Cif0SjQQznS9OxLWPgEnoZgPVYY33wXX8U/vntSnFYtjw\r\n"
            + "xdZ5eS5It19ewkjYm9l4gbKRbfzA4YNA3SZu/2zoDmmg8lAEFt4kWJbBJuJ99FA5\r\n"
            + "QvfSpUcSkRvqGuHqJw3pWGYNHVJF4Fluq7YbsUk8M/mPcTnVKIuMxrg=\r\n" 
            + "-----END RSA PRIVATE KEY-----";

    public static final String RSA_PUBLIC = "-----BEGIN PUBLIC KEY-----\r\n"
            + "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAyY2KRnTj0KR+y/N3KmQ2\r\n"
            + "msmr8OY/O0v+LINflM/JBQRsqa0Jo5RWWcL3epTx7Xf+yNA50l8Gxh3MtAMbylYL\r\n"
            + "nK4RA3MAzBehWfhdJLUiQo5hPwp+meV3km42poqVbxGfucNGXKWaOrdF+yJZCpSH\r\n"
            + "n4AZKVK+nFOa1cYJMvDKh2lohBabFlwO/Fi5jo8M4XiABZk5IIkQX/KC/rZbagHc\r\n"
            + "3/qMdr7ulohJ2jxmj3w3+sxttDV5GAb/vya/XIVaXCqpzSFKkmBV3qqlj/z8AIcI\r\n"
            + "MXTZXjBLqTd+x0LvNcE9aAcA6is+I1W2mNHhYqip142NGVPsEdNaFr1kN4GSSzPZ\r\n" 
            + "bQIDAQAB\r\n"
            + "-----END PUBLIC KEY-----";
}
