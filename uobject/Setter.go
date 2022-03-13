package uobject

import "github.com/IoC-Tools/common"

type Setter interface {
	Set(string, common.Any) error
}
