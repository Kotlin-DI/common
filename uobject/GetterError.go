package uobject

import "fmt"

type GetterError struct {
	key string
}

func (e GetterError) Error() string {
	return fmt.Sprintf("cannot get %s filed.", e.key)
}
