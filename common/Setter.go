package common

type Setter interface {
	Set(string) (Any, error)
}
