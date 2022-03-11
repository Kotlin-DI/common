package common

type Getter interface {
	Get(string) (Any, error)
}
