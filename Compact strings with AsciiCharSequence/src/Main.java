import java.util.Arrays;

class AsciiCharSequence implements java.lang.CharSequence {
    byte[] codes;

    public AsciiCharSequence(byte[] codes) {
        this.codes = codes;
    }

    @Override
    public int length() {
        return codes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) codes[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(java.util.Arrays.copyOfRange(codes, start, end));
    }

    @Override
    public String toString() {
        return new String(this.codes);
    }

    // implementation
}