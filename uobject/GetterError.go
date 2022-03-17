package uobject

import "fmt"

type GetterError struct {
	key   string
	cause error
}

func (e GetterError) Error() string {
	return fmt.Sprintf("cannot get %s filed: %s", e.key, e.cause.Error())
}
