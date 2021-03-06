package com.misker.mike.hasher.hashers;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SHA512HasherTest {
    @Test
    public void shouldCreateSHA512Hash() throws IOException {
        InputStream inputStream = IOUtils.toInputStream("some string to hash");
        Hasher sha512Hasher = new SHA512Hasher();
        String hashedString = sha512Hasher.hash(inputStream);
        assertThat(hashedString, is("921d459060ff11fcf3bcd72dfdc37361abe43695bece7f2f71ddae0f3048df7fcec9c850f264a0ea2ccd1aa1e022be322a0f6d720c683240c141b704e2063a30"));
    }
}
