package main

import "testing"

func TestHello(t *testing.T) {
	t.Run("Testing Hello world", func(t *testing.T) {
		got := Hello("Hacktoberfest")
		want := "Hello, Hacktoberfest!"
		assertionHandler(t, got, want)
	})
}

func assertionHandler(t testing.TB, got, want string) {
	t.Helper()
	if got != want {
		t.Errorf("got %q want %q", got, want)
	}
}
