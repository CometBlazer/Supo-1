public class Vector2D {
    private float x;
    private float y;

    public Vector2D(float x, float y) {
        this.x = x; 
        this.y = y;
    }

    public float magnitude() {
        return (float)Math.sqrt(x * x + y * y);
    }

    public void add(Vector2D other) {
        this.x += other.x;
        this.y += other.y;
    }

    public void scalarMultiply(float other) {
        this.x *= other;
        this.y *= other;
    }

    public void normalize() {
        float m = magnitude();
        if (m != 0) {
            this.x /= m;
            this.y /= m;
        }
    }
}
