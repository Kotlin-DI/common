package uobject

import "github.com/IoC-Tools/common"

type UObject[T common.Any] interface {
	Getter[T]
	Setter[T]
}
