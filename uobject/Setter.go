package uobject

import "github.com/IoC-Tools/common"

type Setter[T common.Any] interface {
	Set(string, T) error
}
